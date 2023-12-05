
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
public class StateChangeTypeActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(StateChangeTypeActionBuilder builder) {
        StateChangeTypeAction stateChangeTypeAction = builder.buildUnchecked();
        Assertions.assertThat(stateChangeTypeAction).isInstanceOf(StateChangeTypeAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { StateChangeTypeAction.builder()
                .type(com.commercetools.api.models.state.StateTypeEnum.findEnum("OrderState")) } };
    }

    @Test
    public void type() {
        StateChangeTypeAction value = StateChangeTypeAction.of();
        value.setType(com.commercetools.api.models.state.StateTypeEnum.findEnum("OrderState"));
        Assertions.assertThat(value.getType())
                .isEqualTo(com.commercetools.api.models.state.StateTypeEnum.findEnum("OrderState"));
    }
}
