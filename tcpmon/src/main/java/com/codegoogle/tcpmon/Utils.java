/*
 * Copyright (C) 2004 Inderjeet Singh
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * $Id$
 */
package com.codegoogle.tcpmon;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
/**
 * Generic utilities
 * @author Inderjeet Singh
 */
public class Utils {

  public static String extractStackTrace(Exception e) {
    ByteArrayOutputStream stackTrace = new ByteArrayOutputStream();
    PrintStream ps = new PrintStream(stackTrace);
    ps.println("Received Exception: " + e.getMessage());
    e.printStackTrace(new PrintStream(stackTrace));
    return stackTrace.toString();
  }
}
