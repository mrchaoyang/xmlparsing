# xmlparsing
Java code that can parse an xml file and get path by element value

Given the attached sample.xml file, the goal is to extract the path for certain elements.
E.g. for string item2, we expect the extracted path to be /itemlist/items[1]/id.

I used JAXB for the job.

The following steps were taken to get it working:
>1. Extract the corresponding xsd file (e.g. using IntelliJ14)
>2. Generate relevant classes (e.g. using xjc)
>3. Inspect and tune the generated classes
>4. Make Demo application working
>5. Refactor to move utility methods into class Util.
 
Also uploaded is the IntelliJ built xmlparsing.jar.

Sample usage and outputs:

> $ java -jar xmlparsing.jar
>
> using file sample.xml
> 
> for str=item2,   path in file is
> /itemlist/items[1]/id
> 
> $ java -jar xmlparsing.jar sample.xml item2 "SubItem 3" item7
>
> using file sample.xml
> 
> for str=item2,   path in file is
> /itemlist/items[1]/id
> for str=SubItem 3,       path in file is
> /itemlist/items[5]/subitems[2]/label
> for str=item7,   path in file is
> /itemlist/items[7]/id



