package com.teja.inheritance;

public abstract class AbstractRecipe {

	void execute()

	{
		prep();
		cook();
		clean();
	}

	abstract void cook();

	abstract void prep();

	abstract void clean();

}
