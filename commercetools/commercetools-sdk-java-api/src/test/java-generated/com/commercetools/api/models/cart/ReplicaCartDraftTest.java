
package com.commercetools.api.models.cart;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ReplicaCartDraftTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ReplicaCartDraftBuilder builder) {
        ReplicaCartDraft replicaCartDraft = builder.buildUnchecked();
        Assertions.assertThat(replicaCartDraft).isInstanceOf(ReplicaCartDraft.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "reference",
                        ReplicaCartDraft.builder().reference(new com.commercetools.api.models.common.ReferenceImpl()) },
                new Object[] { "key", ReplicaCartDraft.builder().key("key") } };
    }

    @Test
    public void reference() {
        ReplicaCartDraft value = ReplicaCartDraft.of();
        value.setReference(new com.commercetools.api.models.common.ReferenceImpl());
        Assertions.assertThat(value.getReference()).isEqualTo(new com.commercetools.api.models.common.ReferenceImpl());
    }

    @Test
    public void key() {
        ReplicaCartDraft value = ReplicaCartDraft.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }
}
