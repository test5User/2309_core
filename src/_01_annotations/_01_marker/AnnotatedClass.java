package _01_annotations._01_marker;

import java.util.StringJoiner;

@MarkerAnnotation
public class AnnotatedClass {
    @MarkerAnnotation
    private String field;

    @Override
    public String toString() {
        return new StringJoiner(", ", AnnotatedClass.class.getSimpleName() + "[", "]")
                .add("field='" + field + "'")
                .toString();
    }
}
