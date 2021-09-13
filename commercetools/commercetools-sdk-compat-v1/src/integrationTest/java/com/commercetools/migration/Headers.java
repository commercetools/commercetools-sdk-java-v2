
package com.commercetools.migration;

import com.commercetools.api.models.cart.CartPagedQueryResponse;

public class Headers implements MigrateV2Example {
    @Override
    public void v2() {
        final CartPagedQueryResponse carts = projectClient().with()
                .carts()
                .get()
                .addHeader("foo", "bar")
                .executeBlocking()
                .getBody();
    }
}
