
package com.commercetools.api.models.project;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CartValueTypeBuilder implements Builder<CartValueType> {

    public CartValueType build() {
        return new CartValueTypeImpl();
    }

    /**
     * builds CartValueType without checking for non null required values
     */
    public CartValueType buildUnchecked() {
        return new CartValueTypeImpl();
    }

    public static CartValueTypeBuilder of() {
        return new CartValueTypeBuilder();
    }

    public static CartValueTypeBuilder of(final CartValueType template) {
        CartValueTypeBuilder builder = new CartValueTypeBuilder();
        return builder;
    }

}
