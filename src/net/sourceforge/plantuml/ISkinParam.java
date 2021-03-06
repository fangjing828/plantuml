/* ========================================================================
 * PlantUML : a free UML diagram generator
 * ========================================================================
 *
 * (C) Copyright 2009-2014, Arnaud Roques
 *
 * Project Info:  http://plantuml.sourceforge.net
 * 
 * This file is part of PlantUML.
 *
 * PlantUML is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * PlantUML distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public
 * License for more details.
 *
 * You should have received a copy of the GNU General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301,
 * USA.
 *
 * [Java is a trademark or registered trademark of Sun Microsystems, Inc.
 * in the United States and other countries.]
 *
 * Original Author:  Arnaud Roques
 *
 * Revision $Revision: 4236 $
 *
 */
package net.sourceforge.plantuml;

import net.sourceforge.plantuml.cucadiagram.Rankdir;
import net.sourceforge.plantuml.cucadiagram.Stereotype;
import net.sourceforge.plantuml.cucadiagram.dot.DotSplines;
import net.sourceforge.plantuml.cucadiagram.dot.GraphvizLayoutStrategy;
import net.sourceforge.plantuml.graphic.HorizontalAlignment;
import net.sourceforge.plantuml.graphic.HtmlColor;
import net.sourceforge.plantuml.graphic.IHtmlColorSet;
import net.sourceforge.plantuml.graphic.SkinParameter;
import net.sourceforge.plantuml.svek.ConditionStyle;
import net.sourceforge.plantuml.svek.PackageStyle;
import net.sourceforge.plantuml.ugraphic.ColorMapper;
import net.sourceforge.plantuml.ugraphic.UFont;
import net.sourceforge.plantuml.ugraphic.UStroke;

public interface ISkinParam extends ISkinSimple {

	public HtmlColor getHyperlinkColor();

	public boolean useUnderlineForHyperlink();

	public HtmlColor getBackgroundColor();

	public HtmlColor getHtmlColor(ColorParam param, Stereotype stereotype, boolean clickable);

	public HtmlColor getFontHtmlColor(FontParam param, Stereotype stereotype);

	public UStroke getThickness(LineParam param, Stereotype stereotype);

	public UFont getFont(FontParam fontParam, Stereotype stereotype, boolean inPackageTitle);

	public HorizontalAlignment getHorizontalAlignment(AlignParam param);

	public HorizontalAlignment getDefaultTextAlignment();

	public int getCircledCharacterRadius();

	public int classAttributeIconSize();

	public ColorMapper getColorMapper();

	public int getDpi();

	public DotSplines getDotSplines();

	public GraphvizLayoutStrategy getStrategy();

	public boolean shadowing();

	public boolean shadowing2(SkinParameter skinParameter);

	public PackageStyle getPackageStyle();

	public boolean useUml2ForComponent();

	public boolean stereotypePositionTop();

	public boolean useSwimlanes(UmlDiagramType type);

	public double getNodesep();

	public double getRanksep();

	public double getRoundCorner();

	public double maxMessageSize();

	public boolean strictUmlStyle();

	public boolean forceSequenceParticipantUnderlined();

	public ConditionStyle getConditionStyle();

	public double minClassWidth();

	public boolean sameClassWidth();

	public Rankdir getRankdir();

	public boolean useOctagonForActivity(Stereotype stereotype);

	public IHtmlColorSet getIHtmlColorSet();

	public int groupInheritance();
	
	public boolean useGuillemet();

	public boolean handwritten();

}