/*
 * #%L
 * Simmetrics Core
 * %%
 * Copyright (C) 2014 - 2015 Simmetrics Authors
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/gpl-3.0.html>.
 * #L%
 */


package org.simmetrics.tokenizers;

import java.util.List;
import java.util.Set;
/**
 * A tokenizer divides an input string into tokens. A tokenizer may not provide
 * {@code null} as a token.
 */
public interface Tokenizer {

	/**
	 * Return tokenized version of a string as a list of tokens.
	 *
	 * @param input
	 *            input string to tokenize
	 *
	 * @return List tokenized version of a string
	 */
	public List<String> tokenizeToList(String input);

//	/**
//	 * Return tokenized version of a string as a multiset of tokens.
//	 *
//	 * @param input
//	 *            input string to tokenize
//	 * @return tokenized version of a string as a multiset
//	 */
//	public Multiset<String> tokenizeToMultiset(String input);
	
	/**
	 * Return tokenized version of a string as a set of tokens.
	 *
	 * @param input
	 *            input string to tokenize
	 * @return tokenized version of a string as a set
	 */
	public Set<String> tokenizeToSet(String input);

}
