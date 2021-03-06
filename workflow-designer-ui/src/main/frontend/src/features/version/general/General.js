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

import { connect } from 'react-redux';

import GeneralView from 'features/version/general/GeneralView';
import {
    getVersionInfo,
    getIsCertified
} from 'features/version/general/generalSelectors';
import { workflowVersionDetailsChangedAction } from 'features/version/versionConstants';
import { isWorkflowArchive } from 'features/workflow/workflowSelectors';
const mapStateToProps = state => ({
    versionInfo: getVersionInfo(state),
    isReadOnly: getIsCertified(state) || isWorkflowArchive(state)
});

const mapDispatchToProps = dispatch => ({
    onDataChange: payload =>
        dispatch(workflowVersionDetailsChangedAction(payload))
});

export default connect(
    mapStateToProps,
    mapDispatchToProps
)(GeneralView);
