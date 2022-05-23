
package com.commercetools.api.models.extension;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 Example to create an instance using the builder pattern
 <div class=code-example>
 <pre><code class='java'>
   ExtensionSetKeyAction extensionSetKeyAction = ExtensionSetKeyAction.builder()
           .build()
 </code></pre>
 </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ExtensionSetKeyActionBuilder implements Builder<ExtensionSetKeyAction> {

    @Nullable
    private String key;

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     */

    public ExtensionSetKeyActionBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    @Nullable
    public String getKey() {
        return this.key;
    }

    public ExtensionSetKeyAction build() {
        return new ExtensionSetKeyActionImpl(key);
    }

    /**
     * builds ExtensionSetKeyAction without checking for non null required values
     */
    public ExtensionSetKeyAction buildUnchecked() {
        return new ExtensionSetKeyActionImpl(key);
    }

    public static ExtensionSetKeyActionBuilder of() {
        return new ExtensionSetKeyActionBuilder();
    }

    public static ExtensionSetKeyActionBuilder of(final ExtensionSetKeyAction template) {
        ExtensionSetKeyActionBuilder builder = new ExtensionSetKeyActionBuilder();
        builder.key = template.getKey();
        return builder;
    }

}
