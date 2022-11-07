
package com.commercetools.api.models.me;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyBusinessUnitChangeNameActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyBusinessUnitChangeNameAction myBusinessUnitChangeNameAction = MyBusinessUnitChangeNameAction.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyBusinessUnitChangeNameActionBuilder implements Builder<MyBusinessUnitChangeNameAction> {

    private String name;

    /**
     *  <p>New name to set.</p>
     */

    public MyBusinessUnitChangeNameActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public MyBusinessUnitChangeNameAction build() {
        Objects.requireNonNull(name, MyBusinessUnitChangeNameAction.class + ": name is missing");
        return new MyBusinessUnitChangeNameActionImpl(name);
    }

    /**
     * builds MyBusinessUnitChangeNameAction without checking for non null required values
     */
    public MyBusinessUnitChangeNameAction buildUnchecked() {
        return new MyBusinessUnitChangeNameActionImpl(name);
    }

    public static MyBusinessUnitChangeNameActionBuilder of() {
        return new MyBusinessUnitChangeNameActionBuilder();
    }

    public static MyBusinessUnitChangeNameActionBuilder of(final MyBusinessUnitChangeNameAction template) {
        MyBusinessUnitChangeNameActionBuilder builder = new MyBusinessUnitChangeNameActionBuilder();
        builder.name = template.getName();
        return builder;
    }

}
