package com.spriithy.dateparser;

/**
 * The Token class is used to associate a Type and a String (as Tuples would do
 * in other languages) to identify tokens identified by the Tokenizer.
 * 
 * @author Théophile Dano
 *
 */
public class Token {

	/**
	 * The type of data the Token holds.
	 * 
	 * @see com.spriithy.dateparser.TokenType
	 */
	public final TokenType type;

	/**
	 * The text representation of the data held by the token. 
	 */
	public final String text;

	public Token(Object obj, TokenType type) {
		text = obj.toString();
		this.type = type;
	}

	public String toString() {
		return "<" + type.name() + ": " + text + ">";
	}

}
