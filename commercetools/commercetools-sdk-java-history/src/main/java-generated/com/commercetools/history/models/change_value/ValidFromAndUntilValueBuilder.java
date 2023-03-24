
package com.commercetools.history.models.change_value;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ValidFromAndUntilValueBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ValidFromAndUntilValue validFromAndUntilValue = ValidFromAndUntilValue.builder()
 *             .validFrom("{validFrom}")
 *             .validUntil("{validUntil}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ValidFromAndUntilValueBuilder implements Builder<ValidFromAndUntilValue> {

    private String validFrom;

    private String validUntil;

    /**
     *
     * @param validFrom value to be set
     * @return Builder
     */

    public ValidFromAndUntilValueBuilder validFrom(final String validFrom) {
        this.validFrom = validFrom;
        return this;
    }

    /**
     *
     * @param validUntil value to be set
     * @return Builder
     */

    public ValidFromAndUntilValueBuilder validUntil(final String validUntil) {
        this.validUntil = validUntil;
        return this;
    }

    public String getValidFrom() {
        return this.validFrom;
    }

    public String getValidUntil() {
        return this.validUntil;
    }

    /**
     * builds ValidFromAndUntilValue with checking for non-null required values
     * @return ValidFromAndUntilValue
     */
    public ValidFromAndUntilValue build() {
        Objects.requireNonNull(validFrom, ValidFromAndUntilValue.class + ": validFrom is missing");
        Objects.requireNonNull(validUntil, ValidFromAndUntilValue.class + ": validUntil is missing");
        return new ValidFromAndUntilValueImpl(validFrom, validUntil);
    }

    /**
     * builds ValidFromAndUntilValue without checking for non-null required values
     * @return ValidFromAndUntilValue
     */
    public ValidFromAndUntilValue buildUnchecked() {
        return new ValidFromAndUntilValueImpl(validFrom, validUntil);
    }

    public static ValidFromAndUntilValueBuilder of() {
        return new ValidFromAndUntilValueBuilder();
    }

    public static ValidFromAndUntilValueBuilder of(final ValidFromAndUntilValue template) {
        ValidFromAndUntilValueBuilder builder = new ValidFromAndUntilValueBuilder();
        builder.validFrom = template.getValidFrom();
        builder.validUntil = template.getValidUntil();
        return builder;
    }

}
