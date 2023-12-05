
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
public class StateSetRolesActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(StateSetRolesActionBuilder builder) {
        StateSetRolesAction stateSetRolesAction = builder.buildUnchecked();
        Assertions.assertThat(stateSetRolesAction).isInstanceOf(StateSetRolesAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { StateSetRolesAction.builder()
                .roles(Collections.singletonList(
                    com.commercetools.api.models.state.StateRoleEnum.findEnum("ReviewIncludedInStatistics"))) } };
    }

    @Test
    public void roles() {
        StateSetRolesAction value = StateSetRolesAction.of();
        value.setRoles(Collections.singletonList(
            com.commercetools.api.models.state.StateRoleEnum.findEnum("ReviewIncludedInStatistics")));
        Assertions.assertThat(value.getRoles())
                .isEqualTo(Collections.singletonList(
                    com.commercetools.api.models.state.StateRoleEnum.findEnum("ReviewIncludedInStatistics")));
    }
}
