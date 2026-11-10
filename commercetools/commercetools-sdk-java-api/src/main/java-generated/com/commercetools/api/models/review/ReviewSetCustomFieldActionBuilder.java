
package com.commercetools.api.models.review;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ReviewSetCustomFieldActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ReviewSetCustomFieldAction reviewSetCustomFieldAction = ReviewSetCustomFieldAction.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ReviewSetCustomFieldActionBuilder implements Builder<ReviewSetCustomFieldAction> {

    private String name;

    @Nullable
    private java.lang.Object value;

    /**
     *  <p>Name of the <span>Custom Field</span>.</p>
     * @param name value to be set
     * @return Builder
     */

    public ReviewSetCustomFieldActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Removing a field that does not exist returns an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidOperationError" rel="nofollow">InvalidOperation</a> error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     * @param value value to be set
     * @return Builder
     */

    public ReviewSetCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
        this.value = value;
        return this;
    }

    /**
     *  <p>Name of the <span>Custom Field</span>.</p>
     * @return name
     */

    public String getName() {
        return this.name;
    }

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Removing a field that does not exist returns an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidOperationError" rel="nofollow">InvalidOperation</a> error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     * @return value
     */

    @Nullable
    public java.lang.Object getValue() {
        return this.value;
    }

    /**
     * builds ReviewSetCustomFieldAction with checking for non-null required values
     * @return ReviewSetCustomFieldAction
     */
    public ReviewSetCustomFieldAction build() {
        Objects.requireNonNull(name, ReviewSetCustomFieldAction.class + ": name is missing");
        return new ReviewSetCustomFieldActionImpl(name, value);
    }

    /**
     * builds ReviewSetCustomFieldAction without checking for non-null required values
     * @return ReviewSetCustomFieldAction
     */
    public ReviewSetCustomFieldAction buildUnchecked() {
        return new ReviewSetCustomFieldActionImpl(name, value);
    }

    /**
     * factory method for an instance of ReviewSetCustomFieldActionBuilder
     * @return builder
     */
    public static ReviewSetCustomFieldActionBuilder of() {
        return new ReviewSetCustomFieldActionBuilder();
    }

    /**
     * create builder for ReviewSetCustomFieldAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ReviewSetCustomFieldActionBuilder of(final ReviewSetCustomFieldAction template) {
        ReviewSetCustomFieldActionBuilder builder = new ReviewSetCustomFieldActionBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
