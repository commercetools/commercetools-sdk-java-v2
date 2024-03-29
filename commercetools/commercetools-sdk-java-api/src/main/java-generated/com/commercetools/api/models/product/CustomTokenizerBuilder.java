
package com.commercetools.api.models.product;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomTokenizerBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomTokenizer customTokenizer = CustomTokenizer.builder()
 *             .plusInputs(inputsBuilder -> inputsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomTokenizerBuilder implements Builder<CustomTokenizer> {

    private java.util.List<String> inputs;

    /**
     *  <p>Contains custom tokens.</p>
     * @param inputs value to be set
     * @return Builder
     */

    public CustomTokenizerBuilder inputs(final String... inputs) {
        this.inputs = new ArrayList<>(Arrays.asList(inputs));
        return this;
    }

    /**
     *  <p>Contains custom tokens.</p>
     * @param inputs value to be set
     * @return Builder
     */

    public CustomTokenizerBuilder inputs(final java.util.List<String> inputs) {
        this.inputs = inputs;
        return this;
    }

    /**
     *  <p>Contains custom tokens.</p>
     * @param inputs value to be set
     * @return Builder
     */

    public CustomTokenizerBuilder plusInputs(final String... inputs) {
        if (this.inputs == null) {
            this.inputs = new ArrayList<>();
        }
        this.inputs.addAll(Arrays.asList(inputs));
        return this;
    }

    /**
     *  <p>Contains custom tokens.</p>
     * @return inputs
     */

    public java.util.List<String> getInputs() {
        return this.inputs;
    }

    /**
     * builds CustomTokenizer with checking for non-null required values
     * @return CustomTokenizer
     */
    public CustomTokenizer build() {
        Objects.requireNonNull(inputs, CustomTokenizer.class + ": inputs is missing");
        return new CustomTokenizerImpl(inputs);
    }

    /**
     * builds CustomTokenizer without checking for non-null required values
     * @return CustomTokenizer
     */
    public CustomTokenizer buildUnchecked() {
        return new CustomTokenizerImpl(inputs);
    }

    /**
     * factory method for an instance of CustomTokenizerBuilder
     * @return builder
     */
    public static CustomTokenizerBuilder of() {
        return new CustomTokenizerBuilder();
    }

    /**
     * create builder for CustomTokenizer instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomTokenizerBuilder of(final CustomTokenizer template) {
        CustomTokenizerBuilder builder = new CustomTokenizerBuilder();
        builder.inputs = template.getInputs();
        return builder;
    }

}
