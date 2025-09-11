
package com.commercetools.api.models.custom_object;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomObjectDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomObjectDraft customObjectDraft = CustomObjectDraft.builder()
 *             .container("{container}")
 *             .key("{key}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomObjectDraftBuilder implements Builder<CustomObjectDraft> {

    private String container;

    private String key;

    private java.lang.Object value;

    @Nullable
    private Long version;

    /**
     *  <p>Namespace to group CustomObjects.</p>
     * @param container value to be set
     * @return Builder
     */

    public CustomObjectDraftBuilder container(final String container) {
        this.container = container;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the CustomObject within the defined <code>container</code>.</p>
     * @param key value to be set
     * @return Builder
     */

    public CustomObjectDraftBuilder key(final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Can be any JSON standard type, such as number, string, boolean, array, object, or a <span>common API data type</span>.</p>
     *  <ul>
     *   <li>Fields within <code>value</code> that have <code>null</code> values <strong>are not saved</strong>.</li>
     *   <li>For values of type <a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> the integrity of the data is not guaranteed. If the referenced object is deleted, the API does not delete the corresponding reference to it and the <code>value</code> points to a non-existing object in such case.</li>
     *  </ul>
     * @param value value to be set
     * @return Builder
     */

    public CustomObjectDraftBuilder value(final java.lang.Object value) {
        this.value = value;
        return this;
    }

    /**
     *  <p>Current version of the CustomObject.</p>
     * @param version value to be set
     * @return Builder
     */

    public CustomObjectDraftBuilder version(@Nullable final Long version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>Namespace to group CustomObjects.</p>
     * @return container
     */

    public String getContainer() {
        return this.container;
    }

    /**
     *  <p>User-defined unique identifier of the CustomObject within the defined <code>container</code>.</p>
     * @return key
     */

    public String getKey() {
        return this.key;
    }

    /**
     *  <p>Can be any JSON standard type, such as number, string, boolean, array, object, or a <span>common API data type</span>.</p>
     *  <ul>
     *   <li>Fields within <code>value</code> that have <code>null</code> values <strong>are not saved</strong>.</li>
     *   <li>For values of type <a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> the integrity of the data is not guaranteed. If the referenced object is deleted, the API does not delete the corresponding reference to it and the <code>value</code> points to a non-existing object in such case.</li>
     *  </ul>
     * @return value
     */

    public java.lang.Object getValue() {
        return this.value;
    }

    /**
     *  <p>Current version of the CustomObject.</p>
     * @return version
     */

    @Nullable
    public Long getVersion() {
        return this.version;
    }

    /**
     * builds CustomObjectDraft with checking for non-null required values
     * @return CustomObjectDraft
     */
    public CustomObjectDraft build() {
        Objects.requireNonNull(container, CustomObjectDraft.class + ": container is missing");
        Objects.requireNonNull(key, CustomObjectDraft.class + ": key is missing");
        Objects.requireNonNull(value, CustomObjectDraft.class + ": value is missing");
        return new CustomObjectDraftImpl(container, key, value, version);
    }

    /**
     * builds CustomObjectDraft without checking for non-null required values
     * @return CustomObjectDraft
     */
    public CustomObjectDraft buildUnchecked() {
        return new CustomObjectDraftImpl(container, key, value, version);
    }

    /**
     * factory method for an instance of CustomObjectDraftBuilder
     * @return builder
     */
    public static CustomObjectDraftBuilder of() {
        return new CustomObjectDraftBuilder();
    }

    /**
     * create builder for CustomObjectDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomObjectDraftBuilder of(final CustomObjectDraft template) {
        CustomObjectDraftBuilder builder = new CustomObjectDraftBuilder();
        builder.container = template.getContainer();
        builder.key = template.getKey();
        builder.value = template.getValue();
        builder.version = template.getVersion();
        return builder;
    }

}
