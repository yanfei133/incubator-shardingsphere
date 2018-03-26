/*
 * Copyright 1999-2015 dangdang.com.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * </p>
 */

package io.shardingjdbc.dbtest.config.bean;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Getter;

@Getter
@XmlRootElement(name = "asserts")
public class AssertsDefinition {

    @XmlAttribute(name = "sharding-rule-config")
    private String shardingRuleConfig;

    private String path;

    @XmlElement(name = "assertDQL")
    private List<AssertDQLDefinition> assertDQL = new ArrayList<>();
    
    @XmlElement(name = "assertDML")
    private List<AssertDMLDefinition> assertDML = new ArrayList<>();
    
    @XmlElement(name = "assertDDL")
    private List<AssertDDLDefinition> assertDDL = new ArrayList<>();

    public void setPath(String path) {
        this.path = path;
    }
}
