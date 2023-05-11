
package com.commercetools.api.predicates;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

/**
 * This enum represents the different string case formats that RAML supports
 * in string template transformations.
 */
public enum StringUtils implements Predicate<String>, UnaryOperator<String> {
    LOWER_CAMEL_CASE(s -> s.matches("\\p{Lower}(\\p{Lower}|\\p{Upper})*"), StringUtils::split,
            StringUtils::lowerCaseFirst, StringUtils::upperCaseFirst),
    UPPER_CAMEL_CASE(s -> s.matches("\\p{Upper}(\\p{Lower}|\\p{Upper})*"), StringUtils::split,
            StringUtils::upperCaseFirst, StringUtils::upperCaseFirst),

    LOWER_HYPHEN_CASE(s -> s.matches("\\p{Lower}(-|\\p{Lower})+"), StringUtils::split, "-", String::toLowerCase),
    UPPER_HYPHEN_CASE(s -> s.matches("\\p{Upper}(-|\\p{Upper})+"), StringUtils::split, "-", String::toUpperCase),

    LOWER_UNDERSCORE_CASE(s -> s.matches("\\p{Lower}(_|\\p{Lower})+"), StringUtils::split, "_", String::toLowerCase),
    UPPER_UNDERSCORE_CASE(s -> s.matches("\\p{Upper}(_|\\p{Upper})+"), StringUtils::split, "_", String::toUpperCase);

    public static String lowerCamelCase(String value) {
        return LOWER_CAMEL_CASE.apply(value);
    }

    public static String upperCamelCase(String value) {
        return UPPER_CAMEL_CASE.apply(value);
    }

    public static String lowerHyphenCase(String value) {
        return LOWER_HYPHEN_CASE.apply(value);
    }

    public static String upperHyphenCase(String value) {
        return UPPER_HYPHEN_CASE.apply(value);
    }

    public static String lowerUnderScoreCase(String value) {
        return LOWER_UNDERSCORE_CASE.apply(value);
    }

    public static String upperUnderScoreCase(String value) {
        return UPPER_UNDERSCORE_CASE.apply(value);
    }

    public static String wrapInQuotes(String value) {
        return String.format("\"%s\"", value);
    }

    private final Predicate<String> test;
    private final Function<String, List<String>> wordSeparator;
    private final String delimiter;
    private final Function<String, String> firstWordTransform;
    private final Function<String, String> otherWordTransform;

    StringUtils(final Predicate<String> test, final Function<String, List<String>> wordSeparator,
            final String delimiter, Function<String, String> firstWordTransform,
            Function<String, String> otherWordTransform) {
        this.test = test;
        this.wordSeparator = wordSeparator;
        this.delimiter = delimiter;
        this.firstWordTransform = firstWordTransform;
        this.otherWordTransform = otherWordTransform;
    }

    StringUtils(final Predicate<String> test, final Function<String, List<String>> wordSeparator,
            final String delimiter, Function<String, String> wordTransform) {
        this(test, wordSeparator, delimiter, wordTransform, wordTransform);
    }

    StringUtils(final Predicate<String> test, final Function<String, List<String>> wordSeparator,
            Function<String, String> firstWordTransform, Function<String, String> otherWordTransform) {
        this(test, wordSeparator, "", firstWordTransform, otherWordTransform);
    }

    /**
     * Tests if the given value matches this case format.
     * @param value the value to test
     * @return true iff. the given value matches this case format
     */
    @Override
    public boolean test(final String value) {
        return test.test(value);
    }

    /**
     * This method tries to detect the case format of the given value and
     * conerts it to this case format.
     *
     * @param value the value convert
     * @return the converted value
     */
    @Override
    public String apply(final String value) {
        final Optional<StringUtils> sourceFormat = Stream.of(values())
                .filter(stringUtils -> stringUtils.test(value))
                .findFirst();
        return sourceFormat.map(source -> render(source.compoundWords(value))).orElse(render(compoundWords(value)));
    }

    public static List<String> split(final String value) {
        return Arrays.asList(value.split("(?<!(^|[A-Z]))(?=[A-Z])|(?<!^)(?=[A-Z][a-z])|[-_]"));
    }

    public String render(final List<String> compoundWords) {
        final StringBuffer buffer = new StringBuffer();
        Function<String, String> transform = firstWordTransform;
        String separator = "";
        for (final String word : compoundWords) {
            if (word.equals("")) {
                continue;
            }
            buffer.append(separator).append(transform.apply(word));
            separator = delimiter;
            transform = otherWordTransform;
        }
        return buffer.toString();
    }

    public List<String> compoundWords(final String value) {
        return wordSeparator.apply(value);
    }

    public static String lowerCaseFirst(final String value) {
        return value.isEmpty() ? ""
                : Character.toLowerCase(value.charAt(0))
                        + (value.length() == 1 ? "" : value.substring(1).toLowerCase());
    }

    public static String upperCaseFirst(final String value) {
        return value.isEmpty() ? ""
                : Character.toUpperCase(value.charAt(0))
                        + (value.length() == 1 ? "" : value.substring(1).toLowerCase());
    }
}
