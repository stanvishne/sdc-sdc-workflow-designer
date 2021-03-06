/*
 * Copyright © 2018 European Support Limited
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.onap.sdc.workflow.api.types;

import java.util.List;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.onap.sdc.workflow.services.types.WorkflowVersionState;

@Data
@NoArgsConstructor
public class VersionStateDto {

    private WorkflowVersionState name;
    private List<WorkflowVersionState> nextStates;

    public VersionStateDto(WorkflowVersionState state) {
        name = state;
        nextStates = state.getNextStates();
    }
}
