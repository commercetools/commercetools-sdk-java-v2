
package com.commercetools.api.models.project;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CartScoreTypeBuilder implements Builder<CartScoreType> {

    public CartScoreType build() {
        return new CartScoreTypeImpl();
    }

    /**
     * builds CartScoreType without checking for non null required values
     */
    public CartScoreType buildUnchecked() {
        return new CartScoreTypeImpl();
    }

    public static CartScoreTypeBuilder of() {
        return new CartScoreTypeBuilder();
    }

    public static CartScoreTypeBuilder of(final CartScoreType template) {
        CartScoreTypeBuilder builder = new CartScoreTypeBuilder();
        return builder;
    }

}
