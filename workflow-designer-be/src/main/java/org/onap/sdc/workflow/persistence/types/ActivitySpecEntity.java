/*
 * Copyright © 2016-2018 European Support Limited
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.onap.sdc.workflow.persistence.types;

import java.util.List;
import lombok.NoArgsConstructor;
import org.openecomp.sdc.versioning.dao.types.Version;

@lombok.Data
@NoArgsConstructor
public class ActivitySpecEntity {

    private String id;
    private Version version;
    private String name;
    private String description;

    private List<String> categoryList;
    private List<ActivitySpecParameter> inputs;
    private List<ActivitySpecParameter> outputs;
    private String type;
    private String content;

    //Not to be maintained in activityspec element
    private String status;

    public ActivitySpecEntity(String id, Version version) {
        this.id = id;
        this.version = version;
    }
}
