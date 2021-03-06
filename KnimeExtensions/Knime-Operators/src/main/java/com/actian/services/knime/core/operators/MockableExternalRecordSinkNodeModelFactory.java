/*
   Copyright 2015 Actian Corporation
 
   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at
 
     http://www.apache.org/licenses/LICENSE-2.0
 
   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
 */
package com.actian.services.knime.core.operators;

import com.pervasive.datarush.knime.core.framework.AbstractDRNodeFactory;
import com.actian.services.dataflow.operators.MockableExternalRecordSink;
import com.pervasive.datarush.knime.core.framework.DRNodeModel;

public final class MockableExternalRecordSinkNodeModelFactory extends AbstractDRNodeFactory<MockableExternalRecordSink> {

    @Override
    protected MockableExternalRecordSinkNodeDialogPane createNodeDialogPane() {
        return new MockableExternalRecordSinkNodeDialogPane();
    }

    @Override
    public DRNodeModel<MockableExternalRecordSink> createDRNodeModel() {
        return new DRNodeModel<MockableExternalRecordSink>( new MockableExternalRecordSink(), new MockableExternalRecordSinkNodeSettings());
    }

    @Override
    protected boolean hasDialog() {
        return true;
    }

}
