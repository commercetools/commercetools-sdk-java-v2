
package com.commercetools;

import com.commercetools.api.models.cart.CartReference;
import com.commercetools.api.models.cart.ReplicaCartDraft;
import com.commercetools.api.models.order.OrderReference;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReplicateTest {
    @Test
    public void replicateCart() {
        ReplicaCartDraft draft = ReplicaCartDraft.of();
        draft.setReference(CartReference.of());

        Assertions.assertThat(draft.getReference()).isInstanceOf(CartReference.class);
    }

    @Test
    public void replicateOrder() {
        ReplicaCartDraft draft = ReplicaCartDraft.of();
        draft.setReference(OrderReference.of());

        Assertions.assertThat(draft.getReference()).isInstanceOf(OrderReference.class);
    }

    @Test
    public void replicateOrderObject() {
        ReplicaCartDraft draft = ReplicaCartDraft.of();
        draft.setReference((Object) OrderReference.of());

        Assertions.assertThat(draft.getReference()).isInstanceOf(OrderReference.class);
    }
}
