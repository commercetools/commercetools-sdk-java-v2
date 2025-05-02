
package com.commercetools.api.models.me;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ReplicaMyCartDraftTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ReplicaMyCartDraftBuilder builder) {
        ReplicaMyCartDraft replicaMyCartDraft = builder.buildUnchecked();
        Assertions.assertThat(replicaMyCartDraft).isInstanceOf(ReplicaMyCartDraft.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "reference", ReplicaMyCartDraft.builder().reference("reference") } };
    }

    @Test
    public void reference() {
        ReplicaMyCartDraft value = ReplicaMyCartDraft.of();
        value.setReference("reference");
        Assertions.assertThat(value.getReference()).isEqualTo("reference");
    }
}
