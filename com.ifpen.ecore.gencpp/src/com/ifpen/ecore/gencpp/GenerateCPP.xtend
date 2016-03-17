package com.ifpen.ecore.gencpp

import java.io.FileWriter
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EcorePackage
import org.eclipse.emf.ecore.EAttribute

class GenerateCPP {
	
	def generatePackage(EPackage p)
	{
		for (c : p.EClassifiers.filter(EClass)) {
			val fn = new FileWriter("c:/tmp/" + c.name + ".cpp")
			fn.write(c.generateClass.toString)
			fn.close
		}
		
	}
	
	def generateClass(EClass c) '''
	public class «c.name»
	{
		«FOR f : c.EAllReferences»
		private «f.EType.name» «f.name»
		«ENDFOR»
		
		«FOR a : c.EAllAttributes»
		«a.generateMember»
		«ENDFOR»
	}
	
	'''
	
	def generateMember(EAttribute att) {
		if (att.upperBound > 1 || att.upperBound == -1)
		'''private Collection<> «att.name»;'''
		else
		'''private «att.EType.name» «att.name»;'''
	}
	
	
	def static void main(String[] args) {
		val gen = new GenerateCPP
//		println(gen.generateClass(EcorePackage.eINSTANCE.EClass))
		gen.generatePackage(EcorePackage.eINSTANCE)
	}
	 
}