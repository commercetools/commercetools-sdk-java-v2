
package com.commercetools.api.models.variant;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * VariantBulkUpdateFailResultBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     VariantBulkUpdateFailResult variantBulkUpdateFailResult = VariantBulkUpdateFailResult.builder()
 *             .plusErrors(errorsBuilder -> errorsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class VariantBulkUpdateFailResultBuilder implements Builder<VariantBulkUpdateFailResult> {

    @Nullable
    private String id;

    @Nullable
    private String key;

    private java.util.List<com.commercetools.api.models.error.ErrorObject> errors;

    /**
     *  <p>Unique identifier of the Variant from the request. Present when the Variant was identified by <code>id</code>.</p>
     * @param id value to be set
     * @return Builder
     */

    public VariantBulkUpdateFailResultBuilder id(@Nullable final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the Variant from the request. Present when the Variant was identified by <code>key</code>.</p>
     * @param key value to be set
     * @return Builder
     */

    public VariantBulkUpdateFailResultBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Errors that caused the update to fail for this Variant.</p>
     * @param errors value to be set
     * @return Builder
     */

    public VariantBulkUpdateFailResultBuilder errors(final com.commercetools.api.models.error.ErrorObject... errors) {
        this.errors = new ArrayList<>(Arrays.asList(errors));
        return this;
    }

    /**
     *  <p>Errors that caused the update to fail for this Variant.</p>
     * @param errors value to be set
     * @return Builder
     */

    public VariantBulkUpdateFailResultBuilder errors(
            final java.util.List<com.commercetools.api.models.error.ErrorObject> errors) {
        this.errors = errors;
        return this;
    }

    /**
     *  <p>Errors that caused the update to fail for this Variant.</p>
     * @param errors value to be set
     * @return Builder
     */

    public VariantBulkUpdateFailResultBuilder plusErrors(
            final com.commercetools.api.models.error.ErrorObject... errors) {
        if (this.errors == null) {
            this.errors = new ArrayList<>();
        }
        this.errors.addAll(Arrays.asList(errors));
        return this;
    }

    /**
     *  <p>Errors that caused the update to fail for this Variant.</p>
     * @param builder function to build the errors value
     * @return Builder
     */

    public VariantBulkUpdateFailResultBuilder plusErrors(
            Function<com.commercetools.api.models.error.ErrorObjectBuilder, Builder<? extends com.commercetools.api.models.error.ErrorObject>> builder) {
        if (this.errors == null) {
            this.errors = new ArrayList<>();
        }
        this.errors.add(builder.apply(com.commercetools.api.models.error.ErrorObjectBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Errors that caused the update to fail for this Variant.</p>
     * @param builder function to build the errors value
     * @return Builder
     */

    public VariantBulkUpdateFailResultBuilder withErrors(
            Function<com.commercetools.api.models.error.ErrorObjectBuilder, Builder<? extends com.commercetools.api.models.error.ErrorObject>> builder) {
        this.errors = new ArrayList<>();
        this.errors.add(builder.apply(com.commercetools.api.models.error.ErrorObjectBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Unique identifier of the Variant from the request. Present when the Variant was identified by <code>id</code>.</p>
     * @return id
     */

    @Nullable
    public String getId() {
        return this.id;
    }

    /**
     *  <p>User-defined unique identifier of the Variant from the request. Present when the Variant was identified by <code>key</code>.</p>
     * @return key
     */

    @Nullable
    public String getKey() {
        return this.key;
    }

    /**
     *  <p>Errors that caused the update to fail for this Variant.</p>
     * @return errors
     */

    public java.util.List<com.commercetools.api.models.error.ErrorObject> getErrors() {
        return this.errors;
    }

    /**
     * builds VariantBulkUpdateFailResult with checking for non-null required values
     * @return VariantBulkUpdateFailResult
     */
    public VariantBulkUpdateFailResult build() {
        Objects.requireNonNull(errors, VariantBulkUpdateFailResult.class + ": errors is missing");
        return new VariantBulkUpdateFailResultImpl(id, key, errors);
    }

    /**
     * builds VariantBulkUpdateFailResult without checking for non-null required values
     * @return VariantBulkUpdateFailResult
     */
    public VariantBulkUpdateFailResult buildUnchecked() {
        return new VariantBulkUpdateFailResultImpl(id, key, errors);
    }

    /**
     * factory method for an instance of VariantBulkUpdateFailResultBuilder
     * @return builder
     */
    public static VariantBulkUpdateFailResultBuilder of() {
        return new VariantBulkUpdateFailResultBuilder();
    }

    /**
     * create builder for VariantBulkUpdateFailResult instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static VariantBulkUpdateFailResultBuilder of(final VariantBulkUpdateFailResult template) {
        VariantBulkUpdateFailResultBuilder builder = new VariantBulkUpdateFailResultBuilder();
        builder.id = template.getId();
        builder.key = template.getKey();
        builder.errors = template.getErrors();
        return builder;
    }

}
