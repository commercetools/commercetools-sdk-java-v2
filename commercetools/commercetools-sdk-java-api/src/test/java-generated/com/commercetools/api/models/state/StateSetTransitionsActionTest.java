
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
public class StateSetTransitionsActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(StateSetTransitionsActionBuilder builder) {
        StateSetTransitionsAction stateSetTransitionsAction = builder.buildUnchecked();
        Assertions.assertThat(stateSetTransitionsAction).isInstanceOf(StateSetTransitionsAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { StateSetTransitionsAction.builder()
                .transitions(Collections
                        .singletonList(new com.commercetools.api.models.state.StateResourceIdentifierImpl())) } };
    }

    @Test
    public void transitions() {
        StateSetTransitionsAction value = StateSetTransitionsAction.of();
        value.setTransitions(
            Collections.singletonList(new com.commercetools.api.models.state.StateResourceIdentifierImpl()));
        Assertions.assertThat(value.getTransitions())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.api.models.state.StateResourceIdentifierImpl()));
    }
}
