package uml2idl.codegenerator

import uml2idl.metamodel.idl.IDLModel
import uml2idl.metamodel.idl.Service
import uml2idl.metamodel.idl.Structure
import uml2idl.metamodel.idl.Function
import uml2idl.metamodel.idl.Type
import uml2idl.metamodel.idl.Field

class IDLCodeGenerator {
	
	
	def String generateCode(IDLModel inputThriftModel) {
		return '''
		«generateServices(inputThriftModel)»
		«generateStructure(inputThriftModel)»
		'''
	}
	
	private def String generateServices(IDLModel myModel) {
		return '''
		«FOR thriftClass : myModel.services»
				service «thriftClass.name» {
				«FOR fnct : thriftClass.function»
					«generateFunction(fnct)»
				«ENDFOR»
						}
		«ENDFOR»
		
		'''
	}
	
	private def String generateStructure(IDLModel myModel) {
		return '''
		«FOR thriftClass : myModel.structures»
						struct «thriftClass.name» {
								«FOR fi : thriftClass.field»
									«generateField(fi)»
								«ENDFOR»
								}
				«ENDFOR»
		
		'''
	}
	
	private def String generateFunction(Function fnct){
		var j =1;
		return '''		returnType «fnct.name»(«FOR parameter : fnct.field» «j++»:«generateParam(parameter)»,«ENDFOR»)
		'''
	}
	
	private def String generateParam(Field f){
		return '''«f.name» «generateType(f.type)»'''
	}
	
	private def String generateField(Field fnct){
		var i = 1;
		return '''
			«i++»:«generateType(fnct.type)» «fnct.name»
		'''
		
	}	
	
	private def String generateType(Type ty){
		return '''«ty.name»'''
	}
	
	
}
