
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
public class StateChangeInitialActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(StateChangeInitialActionBuilder builder) {
        StateChangeInitialAction stateChangeInitialAction = builder.buildUnchecked();
        Assertions.assertThat(stateChangeInitialAction).isInstanceOf(StateChangeInitialAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { StateChangeInitialAction.builder().initial(true) } };
    }

    @Test
    public void initial() {
        StateChangeInitialAction value = StateChangeInitialAction.of();
        value.setInitial(true);
        Assertions.assertThat(value.getInitial()).isEqualTo(true);
    }
}
