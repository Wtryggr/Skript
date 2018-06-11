#parse("License Header.java")
#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

import org.bukkit.event.Event;
import org.eclipse.jdt.annotation.Nullable;

import ch.njol.skript.Skript;
import ch.njol.skript.doc.Description;
import ch.njol.skript.doc.Examples;
import ch.njol.skript.doc.Name;
import ch.njol.skript.doc.Since;
import ch.njol.skript.lang.Expression;
import ch.njol.skript.lang.ExpressionType;
import ch.njol.skript.lang.SkriptParser;
import ch.njol.skript.lang.util.SimpleExpression;
import ch.njol.util.Kleenean;

@Name("${Expression_Name}")
@Description("${Description}")
@Examples("")
@Since("INSERT VERSION")
public class Expr${NAME} extends SimpleExpression<${Return_Type}> {

	static {
		Skript.registerExpression(Expr${NAME}.class, ${Return_Type}.class, ExpressionType.${Expression_Type}, "");
	}

	@Override
	public boolean init(Expression<?>[] exprs, int matchedPattern, Kleenean isDelayed, SkriptParser.ParseResult parseResult) {
		return true;
	}

	@Override
	@Nullable
	protected ${Return_Type}[] get(Event e) {
	    return null;
	}

	@Override
	public String toString(@Nullable Event e, boolean debug) {
		return "";
	}

	@Override
	public Class<? extends ${Return_Type}> getReturnType() {
		return ${Return_Type}.class;
	}
	
}
