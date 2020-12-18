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
		return '''
		
		'''
	}
	
	private def String generateField(Field fnct){
		return '''
			«generateType(fnct.type)»  «fnct.name»
		'''
		
	}	
	
	private def String generateType(Type ty){
		switch ty.name {
			case ty.name == 'EInt' : return 'i32'
			case ty.name == 'EDouble' : return 'double'
			case ty.name == 'EString' : return 'string'
			case ty.name == "EChar" : return 'string'
			case ty.name == "EBoolean" : return 'bool'
			default : return '''«ty.name»'''
			}
	}
	
	
}
