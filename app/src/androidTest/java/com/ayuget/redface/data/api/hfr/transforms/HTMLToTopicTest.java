/*
 * Copyright 2015 Ayuget
 *
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
 */

package com.ayuget.redface.data.api.hfr.transforms;

import com.ayuget.redface.BaseTestCase;
import com.ayuget.redface.data.api.model.Topic;
import static org.assertj.core.api.Assertions.*;
import java.io.IOException;

public class HTMLToTopicTest extends BaseTestCase {
    public void test_parseTopicDetails() throws IOException {
        HTMLToTopic htmlToTopic = new HTMLToTopic();

        Topic topic = htmlToTopic.call(readAssetFile("hfr_topic.html"));

        assertThat(topic).isNotNull();
        assertThat(topic.getId()).isEqualTo(21748);
        assertThat(topic.getSubject()).isEqualTo("[Projet] HFR4droid 0.8.6 - 10k downloads, merci à tous");
        assertThat(topic.getPagesCount()).isEqualTo(419);
    }
}
