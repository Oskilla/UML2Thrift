package uml2idl.codegenerator

import uml2idl.metamodel.idl.IDLModel

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
				«FOR Function fnct : thriftClass.function»
				       «generateFunction(fnct)»
				«ENDFOR»
				}
		«ENDFOR»
		
		'''
	}
	
	private def String generateStructure(IDLModel myModel) {
		return '''
		«FOR thriftClass : myModel.»
						struct «thriftClass.name» {
									«FOR Field f : thriftClass.field»
										«f.generateField»
									«ENDFOR»
									}
				«ENDFOR»
		
		'''
	}
	
	private def String generateFunction(Function fnct){
		
	}
	
	
}
