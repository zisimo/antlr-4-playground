/*
 [The "BSD license"]
 Copyright (c) 2011 Terence Parr
 All rights reserved.

 Redistribution and use in source and binary forms, with or without
 modification, are permitted provided that the following conditions
 are met:

 1. Redistributions of source code must retain the above copyright
    notice, this list of conditions and the following disclaimer.
 2. Redistributions in binary form must reproduce the above copyright
    notice, this list of conditions and the following disclaimer in the
    documentation and/or other materials provided with the distribution.
 3. The name of the author may not be used to endorse or promote products
    derived from this software without specific prior written permission.

 THIS SOFTWARE IS PROVIDED BY THE AUTHOR ``AS IS'' AND ANY EXPRESS OR
 IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED.
 IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR ANY DIRECT, INDIRECT,
 INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT
 NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
 THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF
 THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package org.antlr.v4.tool;

import org.antlr.runtime.Token;

/** A problem with the symbols and/or meaning of a grammar such as rule
 *  redefinition.
 */
public class GrammarSemanticsMessage extends ANTLRMessage {
	public Grammar g;
	/** Most of the time, we'll have a token such as an undefined rule ref
     *  and so this will be set.
     */
    public Token offendingToken;

	/*
    public GrammarSemanticsMessage(ErrorType etype,
                                   Grammar g,
                                   Token offendingToken,
                                   Object... args)
    {
        super(etype,args);
        this.g = g;
        if ( g!=null ) fileName = g.fileName;
        this.offendingToken = offendingToken;
        if ( offendingToken!=null ) {
            line = offendingToken.getLine();
            charPosition = offendingToken.getCharPositionInLine();
        }
    }
*/
    public GrammarSemanticsMessage(ErrorType etype,
                                   String fileName,
                                   Token offendingToken,
                                   Object... args)
    {
        super(etype,args);
        this.fileName = fileName;
        this.offendingToken = offendingToken;
        if ( offendingToken!=null ) {
            line = offendingToken.getLine();
            charPosition = offendingToken.getCharPositionInLine();
        }
    }
}

