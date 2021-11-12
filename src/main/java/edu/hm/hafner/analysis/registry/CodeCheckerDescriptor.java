package edu.hm.hafner.analysis.registry;

import edu.hm.hafner.analysis.IssueParser;
import edu.hm.hafner.analysis.parser.CodeCheckerParser;

/**
 * A descriptor for the Codechecker parser.
 *
 */
class CodeCheckerDescriptor extends ParserDescriptor {
    private static final String ID = "CodeChecker";
    private static final String NAME = "CodeChecker";

    CodeCheckerDescriptor() {
        super(ID, NAME);
    }

    @Override
    public IssueParser createParser(final Option... options) {
        return new CodeCheckerParser();
    }
}
