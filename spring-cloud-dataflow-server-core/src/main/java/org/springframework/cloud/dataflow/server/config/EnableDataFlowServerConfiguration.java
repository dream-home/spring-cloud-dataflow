/*
 * Copyright 2016 the original author or authors.
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

package org.springframework.cloud.dataflow.server.config;

import org.springframework.cloud.dataflow.server.EnableDataFlowServer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Configuration for {@link EnableDataFlowServer} which adds a marker bean which
 * auto-config classes can use to conditionally check if auto configuration should be
 * activated.
 *
 * @author Janne Valkealahti
 */
@Configuration
public class EnableDataFlowServerConfiguration {

	@Bean
	public Marker enableConfigServerMarker() {
		return new Marker();
	}

	class Marker {
	}
}
