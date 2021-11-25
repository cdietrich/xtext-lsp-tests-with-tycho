package org.xtext.example.mydsl.tests;


public class FoldingConfiguration extends TextDocumentConfiguration {

	private String expectedFoldings;

	public String getExpectedFoldings() {
		return expectedFoldings;
	}

	public void setExpectedFoldings(String expectedFoldings) {
		this.expectedFoldings = expectedFoldings;
	}
	
}
