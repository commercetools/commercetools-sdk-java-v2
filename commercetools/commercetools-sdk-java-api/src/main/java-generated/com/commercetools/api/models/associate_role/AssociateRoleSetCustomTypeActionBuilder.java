
package com.commercetools.api.models.associate_role;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AssociateRoleSetCustomTypeActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AssociateRoleSetCustomTypeAction associateRoleSetCustomTypeAction = AssociateRoleSetCustomTypeAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AssociateRoleSetCustomTypeActionBuilder implements Builder<AssociateRoleSetCustomTypeAction> {

    @Nullable
    private com.commercetools.api.models.type.TypeResourceIdentifier type;

    @Nullable
    private com.commercetools.api.models.type.FieldContainer fields;

    /**
     *  <p>Defines the Type that extends the AssociateRole with Custom Fields. If absent, any existing Type and Custom Fields are removed from the AssociateRole.</p>
     * @param builder function to build the type value
     * @return Builder
     */

    public AssociateRoleSetCustomTypeActionBuilder type(
            Function<com.commercetools.api.models.type.TypeResourceIdentifierBuilder, com.commercetools.api.models.type.TypeResourceIdentifierBuilder> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Defines the Type that extends the AssociateRole with Custom Fields. If absent, any existing Type and Custom Fields are removed from the AssociateRole.</p>
     * @param builder function to build the type value
     * @return Builder
     */

    public AssociateRoleSetCustomTypeActionBuilder withType(
            Function<com.commercetools.api.models.type.TypeResourceIdentifierBuilder, com.commercetools.api.models.type.TypeResourceIdentifier> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p>Defines the Type that extends the AssociateRole with Custom Fields. If absent, any existing Type and Custom Fields are removed from the AssociateRole.</p>
     * @param type value to be set
     * @return Builder
     */

    public AssociateRoleSetCustomTypeActionBuilder type(
            @Nullable final com.commercetools.api.models.type.TypeResourceIdentifier type) {
        this.type = type;
        return this;
    }

    /**
     *  <p>Sets the Custom Fields for the AssociateRole.</p>
     * @param builder function to build the fields value
     * @return Builder
     */

    public AssociateRoleSetCustomTypeActionBuilder fields(
            Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainerBuilder> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Sets the Custom Fields for the AssociateRole.</p>
     * @param builder function to build the fields value
     * @return Builder
     */

    public AssociateRoleSetCustomTypeActionBuilder withFields(
            Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainer> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of());
        return this;
    }

    /**
     *  <p>Sets the Custom Fields for the AssociateRole.</p>
     * @param fields value to be set
     * @return Builder
     */

    public AssociateRoleSetCustomTypeActionBuilder fields(
            @Nullable final com.commercetools.api.models.type.FieldContainer fields) {
        this.fields = fields;
        return this;
    }

    /**
     *  <p>Defines the Type that extends the AssociateRole with Custom Fields. If absent, any existing Type and Custom Fields are removed from the AssociateRole.</p>
     * @return type
     */

    @Nullable
    public com.commercetools.api.models.type.TypeResourceIdentifier getType() {
        return this.type;
    }

    /**
     *  <p>Sets the Custom Fields for the AssociateRole.</p>
     * @return fields
     */

    @Nullable
    public com.commercetools.api.models.type.FieldContainer getFields() {
        return this.fields;
    }

    /**
     * builds AssociateRoleSetCustomTypeAction with checking for non-null required values
     * @return AssociateRoleSetCustomTypeAction
     */
    public AssociateRoleSetCustomTypeAction build() {
        return new AssociateRoleSetCustomTypeActionImpl(type, fields);
    }

    /**
     * builds AssociateRoleSetCustomTypeAction without checking for non-null required values
     * @return AssociateRoleSetCustomTypeAction
     */
    public AssociateRoleSetCustomTypeAction buildUnchecked() {
        return new AssociateRoleSetCustomTypeActionImpl(type, fields);
    }

    /**
     * factory method for an instance of AssociateRoleSetCustomTypeActionBuilder
     * @return builder
     */
    public static AssociateRoleSetCustomTypeActionBuilder of() {
        return new AssociateRoleSetCustomTypeActionBuilder();
    }

    /**
     * create builder for AssociateRoleSetCustomTypeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AssociateRoleSetCustomTypeActionBuilder of(final AssociateRoleSetCustomTypeAction template) {
        AssociateRoleSetCustomTypeActionBuilder builder = new AssociateRoleSetCustomTypeActionBuilder();
        builder.type = template.getType();
        builder.fields = template.getFields();
        return builder;
    }

}
