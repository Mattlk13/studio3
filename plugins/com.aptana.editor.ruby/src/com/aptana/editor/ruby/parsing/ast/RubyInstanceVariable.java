package com.aptana.editor.ruby.parsing.ast;

import com.aptana.editor.ruby.core.IRubyElement;

public class RubyInstanceVariable extends RubyField
{

	public RubyInstanceVariable(String name, int start, int end)
	{
		super(name, start, end);
	}

	@Override
	public short getType()
	{
		return IRubyElement.INSTANCE_VAR;
	}
}
