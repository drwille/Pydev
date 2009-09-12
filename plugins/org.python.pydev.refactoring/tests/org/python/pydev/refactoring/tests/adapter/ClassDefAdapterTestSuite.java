/* 
 * Copyright (C) 2006, 2007  Dennis Hunziker, Ueli Kistler
 * Copyright (C) 2007  Reto Schuettel, Robin Stocker
 */

package org.python.pydev.refactoring.tests.adapter;

import java.io.File;

import junit.framework.Test;

import org.python.pydev.refactoring.tests.core.AbstractIOTestSuite;
import org.python.pydev.refactoring.tests.core.IInputOutputTestCase;

public class ClassDefAdapterTestSuite extends AbstractIOTestSuite {
	
	public ClassDefAdapterTestSuite(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public static Test suite() {
		String testdir = "tests" + File.separator + "python" + File.separator + "adapter" + File.separator + "classdef";
		ClassDefAdapterTestSuite testSuite = new ClassDefAdapterTestSuite("ClassDef Adapter");

		testSuite.createTests(testdir);
        testSuite.addTest(new HierarchyTestCase("testHierarchyWithBuiltins"));

		return testSuite;
	}

	@Override
	protected IInputOutputTestCase createTestCase(String testCaseName) {
		return new ClassDefAdapterTestCase(testCaseName);
	}
}
