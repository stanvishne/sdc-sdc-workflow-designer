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

package org.onap.sdc.workflow.services.impl.mappers;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.onap.sdc.workflow.persistence.types.WorkflowVersion;
import org.openecomp.sdc.versioning.dao.types.Version;

@Mapper(componentModel = "spring", uses = VersionStateMapper.class)
public interface VersionMapper {


    @Mapping(source = "status", target = "state")
    WorkflowVersion versionToWorkflowVersion(Version version);

    @InheritInverseConfiguration
    Version workflowVersionToVersion(WorkflowVersion workflowVersion);

}
