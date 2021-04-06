/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.example.platform.client.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.i18n.client.Constants;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.CssResource;

public interface PlatformClientBundle extends ClientBundle {

    PlatformClientBundle BUNDLE = GWT.create(PlatformClientBundle.class);

    HelloWorldConstants CONSTANTS = GWT.create(HelloWorldConstants.class);

    interface HelloWorldConstants extends Constants {
        @DefaultStringValue("Platform")
        String appTitle();

        @DefaultStringValue("Title")
        String title();

        @DefaultStringValue("Description")
        String description();

        @DefaultStringValue("Priority")
        String priority();

        @DefaultStringValue("Add")
        String add();

        @DefaultStringValue("Mark Done")
        String mark_done();

        @DefaultStringValue("New Todo")
        String new_todo();

        @DefaultStringValue("Add a new todo list item")
        String add_new_todo();

        @DefaultStringValue("Todo Items")
        String todo_items();

        @DefaultStringValue("Done Items")
        String done_items();
    }

    interface HelloWorldCssResource extends CssResource {
        String addButton();

        String doneButton();

        String contentMargin();
    }

    @Source("platform.gss")
    HelloWorldCssResource css();
}
