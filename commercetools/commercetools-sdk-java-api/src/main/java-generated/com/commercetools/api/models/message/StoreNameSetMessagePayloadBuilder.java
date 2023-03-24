
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StoreNameSetMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StoreNameSetMessagePayload storeNameSetMessagePayload = StoreNameSetMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StoreNameSetMessagePayloadBuilder implements Builder<StoreNameSetMessagePayload> {

    @Nullable
    private com.commercetools.api.models.common.LocalizedString name;

    @Nullable
    private java.util.List<com.commercetools.api.models.common.LocalizedString> nameAllLocales;

    /**
     *  <p>Name of the Store set during the Set Name update action.</p>
     * @param builder function to build the name value
     * @return Builder
     */

    public StoreNameSetMessagePayloadBuilder name(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Name of the Store set during the Set Name update action.</p>
     * @param name value to be set
     * @return Builder
     */

    public StoreNameSetMessagePayloadBuilder name(
            @Nullable final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>Names set for the Store in different locales.</p>
     * @param nameAllLocales value to be set
     * @return Builder
     */

    public StoreNameSetMessagePayloadBuilder nameAllLocales(
            @Nullable final com.commercetools.api.models.common.LocalizedString... nameAllLocales) {
        this.nameAllLocales = new ArrayList<>(Arrays.asList(nameAllLocales));
        return this;
    }

    /**
     *  <p>Names set for the Store in different locales.</p>
     * @param nameAllLocales value to be set
     * @return Builder
     */

    public StoreNameSetMessagePayloadBuilder nameAllLocales(
            @Nullable final java.util.List<com.commercetools.api.models.common.LocalizedString> nameAllLocales) {
        this.nameAllLocales = nameAllLocales;
        return this;
    }

    /**
     *  <p>Names set for the Store in different locales.</p>
     * @param nameAllLocales value to be set
     * @return Builder
     */

    public StoreNameSetMessagePayloadBuilder plusNameAllLocales(
            @Nullable final com.commercetools.api.models.common.LocalizedString... nameAllLocales) {
        if (this.nameAllLocales == null) {
            this.nameAllLocales = new ArrayList<>();
        }
        this.nameAllLocales.addAll(Arrays.asList(nameAllLocales));
        return this;
    }

    /**
     *  <p>Names set for the Store in different locales.</p>
     * @param builder function to build the nameAllLocales value
     * @return Builder
     */

    public StoreNameSetMessagePayloadBuilder plusNameAllLocales(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        if (this.nameAllLocales == null) {
            this.nameAllLocales = new ArrayList<>();
        }
        this.nameAllLocales.add(builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Names set for the Store in different locales.</p>
     * @param builder function to build the nameAllLocales value
     * @return Builder
     */

    public StoreNameSetMessagePayloadBuilder withNameAllLocales(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.nameAllLocales = new ArrayList<>();
        this.nameAllLocales.add(builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build());
        return this;
    }

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    @Nullable
    public java.util.List<com.commercetools.api.models.common.LocalizedString> getNameAllLocales() {
        return this.nameAllLocales;
    }

    /**
     * builds StoreNameSetMessagePayload with checking for non-null required values
     * @return StoreNameSetMessagePayload
     */
    public StoreNameSetMessagePayload build() {
        return new StoreNameSetMessagePayloadImpl(name, nameAllLocales);
    }

    /**
     * builds StoreNameSetMessagePayload without checking for non-null required values
     * @return StoreNameSetMessagePayload
     */
    public StoreNameSetMessagePayload buildUnchecked() {
        return new StoreNameSetMessagePayloadImpl(name, nameAllLocales);
    }

    public static StoreNameSetMessagePayloadBuilder of() {
        return new StoreNameSetMessagePayloadBuilder();
    }

    public static StoreNameSetMessagePayloadBuilder of(final StoreNameSetMessagePayload template) {
        StoreNameSetMessagePayloadBuilder builder = new StoreNameSetMessagePayloadBuilder();
        builder.name = template.getName();
        builder.nameAllLocales = template.getNameAllLocales();
        return builder;
    }

}
