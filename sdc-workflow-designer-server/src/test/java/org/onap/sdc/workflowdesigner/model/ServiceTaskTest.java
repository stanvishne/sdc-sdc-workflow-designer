/**
 * Copyright (c) 2018 ZTE Corporation.
 * All rights reserved. This program and the accompanying materials
 * are made available under the Apache License, Version 2.0
 * and the Eclipse Public License v1.0 which both accompany this distribution,
 * and are available at http://www.eclipse.org/legal/epl-v10.html
 * and http://www.apache.org/licenses/LICENSE-2.0
 *
 * Contributors:
 *     ZTE - initial API and implementation and/or initial documentation
 */
package org.onap.sdc.workflowdesigner.model;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 *
 */
public class ServiceTaskTest {

  /**
   * @throws java.lang.Exception
   */
  @Before
  public void setUp() throws Exception {}

  /**
   * @throws java.lang.Exception
   */
  @After
  public void tearDown() throws Exception {}

  @Test
  public void test() {
    String className = "className";
    List<Parameter> inputs = new ArrayList<>();
    List<Parameter> outputs = new ArrayList<>();
    
    ServiceTask st = new ServiceTask();
    st.setClassName(className);
    st.setInputs(inputs);
    st.setOutputs(outputs);
    
    assertEquals(className, st.getClassName());
    assertEquals(inputs, st.getInputs());
    assertEquals(outputs, st.getOutputs());
  }

}