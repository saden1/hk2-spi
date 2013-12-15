/* 
 * Copyright 2013 Sharmarke Aden <www.github.com/saden1>.
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
package com.github.saden1.hk2.demo;

import com.github.saden1.hk2.spi.TestContract;
import external.org.glassfish.hk2.api.ServiceLocator;
import external.org.glassfish.hk2.utilities.ServiceLocatorUtilities;
import static org.assertj.core.api.Assertions.assertThat;
import org.testng.annotations.Test;

/**
 *
 * @author Sharmarke Aden <www.github.com/saden1>
 */
public class DemoTest {

    @Test
    public void testSomeMethod() {
//        ServiceFactory factory = ServiceFactory.getInstance();
//        TestContract contract = factory.getService(TestContract.class);
//        assertThat(contract).isNotNull();
        ServiceLocator loader = ServiceLocatorUtilities.createAndPopulateServiceLocator();
        TestContract result = loader.getService(TestContract.class);
        assertThat(result).isNotNull();
    }

}
