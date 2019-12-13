package com.komanrudden.features;

public class TextBlocks {

    @SuppressWarnings("preview")
    public void demoTextBlocks() {

    	//Three string quotes to open and close new Block Texts
        String html =
"""
<html>
	<body>
		<h1>Java 13 Text Blocks</h1>
	</body>
</html>
""";
        String json =
"""

{
	"firstName": "Koman",
	"surname": "Rudden",
	"website": "komanrudden.com",
}
""";

        System.out.println(html);
        System.out.println(json);
    }

	@SuppressWarnings("preview")
    public void demoNewStringMethods() {

    	//Demoing 'formatted' and 'replace'
		String demo =
				"""
					Name: %s
					Age: %d
					Salary: $%.2f
				""".formatted("Koman Rudden", 43, 170000.00);
		System.out.println(demo);

		demo = demo.replace("Name", "Full Name");
		System.out.println(demo);
	}
}
