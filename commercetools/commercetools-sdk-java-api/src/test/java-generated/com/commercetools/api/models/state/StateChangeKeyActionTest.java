
package com.commercetools.api.models.state;

import com.tngtech.junit.dataprovider.DataProvider;
import com.tngtech.junit.dataprovider.DataProviderExtension;
import com.tngtech.junit.dataprovider.UseDataProvider;
import com.tngtech.junit.dataprovider.UseDataProviderExtension;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(UseDataProviderExtension.class)
@ExtendWith(DataProviderExtension.class)
public class StateChangeKeyActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(StateChangeKeyActionBuilder builder) {
        StateChangeKeyAction stateChangeKeyAction = builder.buildUnchecked();
        Assertions.assertThat(stateChangeKeyAction).isInstanceOf(StateChangeKeyAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { StateChangeKeyAction.builder().key("key") } };
    }

    @Test
    public void key() {
        StateChangeKeyAction value = StateChangeKeyAction.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }
}
