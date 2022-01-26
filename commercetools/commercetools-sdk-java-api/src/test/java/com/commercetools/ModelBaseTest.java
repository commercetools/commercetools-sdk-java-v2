
package com.commercetools;

import java.time.ZonedDateTime;
import java.util.Arrays;

import com.commercetools.api.models.state.State;
import com.commercetools.api.models.state.StateRoleEnum;

import io.vrap.rmf.base.client.ModelBase;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class ModelBaseTest {
    @Test
    public void reflectionString() {
        State state = State.builder()
                .createdAt(ZonedDateTime.parse("2022-01-26T09:10:44.155Z"))
                .roles(StateRoleEnum.REVIEW_INCLUDED_IN_STATISTICS)
                .buildUnchecked();
        Assertions.assertThat(ModelBase.reflectionString(state))
                .isEqualTo(
                    "StateImpl[builtIn=<null>,createdAt=2022-01-26T09:10:44.155Z,createdBy=<null>,description=<null>,id=<null>,initial=<null>,key=<null>,lastModifiedAt=<null>,lastModifiedBy=<null>,name=<null>,roles=ArrayList{ReviewIncludedInStatistics},transitions=<null>,type=<null>,version=<null>]");
    }

    @Test
    public void cast() {
        Assertions.assertThat(ModelBase.reflectionString(Arrays.asList("abc", "def")))
                .isEqualTo("Arrays.ArrayList[a={abc,def}]");
    }
}
