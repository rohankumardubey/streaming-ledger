/*
 *  Copyright 2018 Data Artisans GmbH
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
 */

package com.dataartisans.streamingledger.sdk.api;

/**
 * An exception that indicates that state was accessed for read, without being
 * declared as readable.
 */
public class StateNotReadableException extends StateAccessException {

    private static final long serialVersionUID = 1L;

    public StateNotReadableException(StateAccess<?> state) {
        super(String.format("State access %s for state %s has not declared read access.",
                state.getStateAccessName(), state.getStateName()));
    }
}
