/*
 * Copyright  2005 The Apache Software Foundation
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */
package org.apache.tools.ant.taskdefs.classloader.report;

import org.apache.tools.ant.Project;
import org.apache.tools.ant.taskdefs.ClassloaderBase;

/**
 * makes reporting destination transparent for reporting objects.
 */
public class FormattedAntLoggerReporter extends AbstractFormattedReporter {
    private ClassloaderBase task;
    public FormattedAntLoggerReporter(ClassloaderBase task, ClassloaderReportFormatter fmt) {
        super(fmt);
        this.task = task;
    }
    /**
     * writes a message line to the reporting dest.
     * @param s the message line to report.
     */
    protected void report(String s) {
        task.log(s, Project.MSG_INFO);
    }
}