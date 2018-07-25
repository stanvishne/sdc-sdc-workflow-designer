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

package org.onap.sdc.workflow.persistence.types;

import javax.validation.constraints.Pattern;
import lombok.Data;
import javax.validation.constraints.NotNull;

@Data
public class ParameterEntity {

    private String id;
    @NotNull(message = "Parameter name may not be null")
    @Pattern(regexp = "[A-Za-z0-9_]*", message = "The field must contain only letters, digits and underscores")
    private String name;
    @NotNull
    private ParameterType type;
    @NotNull
    private boolean mandatory;
}