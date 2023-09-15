
package com.commercetools.api.models.state;

import java.util.Collections;

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
public class StateUpdateTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(StateUpdateBuilder builder) {
        StateUpdate stateUpdate = builder.buildUnchecked();
        Assertions.assertThat(stateUpdate).isInstanceOf(StateUpdate.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { StateUpdate.builder().version(2L) }, new Object[] { StateUpdate.builder()
                .actions(Collections.singletonList(new com.commercetools.api.models.state.StateUpdateActionImpl())) } };
    }

    @Test
    public void version() {
        StateUpdate value = StateUpdate.of();
        value.setVersion(2L);
        Assertions.assertThat(value.getVersion()).isEqualTo(2L);
    }

    @Test
    public void actions() {
        StateUpdate value = StateUpdate.of();
        value.setActions(Collections.singletonList(new com.commercetools.api.models.state.StateUpdateActionImpl()));
        Assertions.assertThat(value.getActions())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.state.StateUpdateActionImpl()));
    }
}
